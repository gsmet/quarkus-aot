package fr.spacefox.perftests.quarkus.core.service819;

import fr.spacefox.perftests.quarkus.core.port.data.Entity819DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service819.model.Model819;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service819 {

    private final Entity819DatasourcePort datasource;

    public Service819(Entity819DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model819 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
