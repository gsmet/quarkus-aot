package fr.spacefox.perftests.quarkus.core.service228;

import fr.spacefox.perftests.quarkus.core.port.data.Entity228DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service228.model.Model228;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service228 {

    private final Entity228DatasourcePort datasource;

    public Service228(Entity228DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model228 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
