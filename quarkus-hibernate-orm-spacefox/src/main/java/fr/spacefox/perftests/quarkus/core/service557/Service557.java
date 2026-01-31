package fr.spacefox.perftests.quarkus.core.service557;

import fr.spacefox.perftests.quarkus.core.port.data.Entity557DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service557.model.Model557;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service557 {

    private final Entity557DatasourcePort datasource;

    public Service557(Entity557DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model557 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
