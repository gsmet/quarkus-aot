package fr.spacefox.perftests.quarkus.core.service854;

import fr.spacefox.perftests.quarkus.core.port.data.Entity854DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service854.model.Model854;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service854 {

    private final Entity854DatasourcePort datasource;

    public Service854(Entity854DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model854 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
