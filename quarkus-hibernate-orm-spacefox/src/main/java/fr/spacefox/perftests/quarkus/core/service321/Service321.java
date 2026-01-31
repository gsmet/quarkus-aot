package fr.spacefox.perftests.quarkus.core.service321;

import fr.spacefox.perftests.quarkus.core.port.data.Entity321DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service321.model.Model321;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service321 {

    private final Entity321DatasourcePort datasource;

    public Service321(Entity321DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model321 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
