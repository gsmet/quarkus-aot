package fr.spacefox.perftests.quarkus.core.service713;

import fr.spacefox.perftests.quarkus.core.port.data.Entity713DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service713.model.Model713;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service713 {

    private final Entity713DatasourcePort datasource;

    public Service713(Entity713DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model713 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
