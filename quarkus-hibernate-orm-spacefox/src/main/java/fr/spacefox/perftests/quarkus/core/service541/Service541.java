package fr.spacefox.perftests.quarkus.core.service541;

import fr.spacefox.perftests.quarkus.core.port.data.Entity541DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service541.model.Model541;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service541 {

    private final Entity541DatasourcePort datasource;

    public Service541(Entity541DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model541 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
