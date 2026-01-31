package fr.spacefox.perftests.quarkus.core.service880;

import fr.spacefox.perftests.quarkus.core.port.data.Entity880DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service880.model.Model880;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service880 {

    private final Entity880DatasourcePort datasource;

    public Service880(Entity880DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model880 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
