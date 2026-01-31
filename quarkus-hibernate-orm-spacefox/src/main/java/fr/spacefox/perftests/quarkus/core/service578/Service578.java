package fr.spacefox.perftests.quarkus.core.service578;

import fr.spacefox.perftests.quarkus.core.port.data.Entity578DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service578.model.Model578;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service578 {

    private final Entity578DatasourcePort datasource;

    public Service578(Entity578DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model578 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
