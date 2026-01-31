package fr.spacefox.perftests.quarkus.core.service72;

import fr.spacefox.perftests.quarkus.core.port.data.Entity72DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service72.model.Model72;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service72 {

    private final Entity72DatasourcePort datasource;

    public Service72(Entity72DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model72 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
