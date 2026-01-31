package fr.spacefox.perftests.quarkus.core.service341;

import fr.spacefox.perftests.quarkus.core.port.data.Entity341DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service341.model.Model341;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service341 {

    private final Entity341DatasourcePort datasource;

    public Service341(Entity341DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model341 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
