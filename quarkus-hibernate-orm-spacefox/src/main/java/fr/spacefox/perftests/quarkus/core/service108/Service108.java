package fr.spacefox.perftests.quarkus.core.service108;

import fr.spacefox.perftests.quarkus.core.port.data.Entity108DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service108.model.Model108;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service108 {

    private final Entity108DatasourcePort datasource;

    public Service108(Entity108DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model108 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
