package fr.spacefox.perftests.quarkus.core.service832;

import fr.spacefox.perftests.quarkus.core.port.data.Entity832DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service832.model.Model832;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service832 {

    private final Entity832DatasourcePort datasource;

    public Service832(Entity832DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model832 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
