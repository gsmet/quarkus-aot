package fr.spacefox.perftests.quarkus.core.service210;

import fr.spacefox.perftests.quarkus.core.port.data.Entity210DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service210.model.Model210;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service210 {

    private final Entity210DatasourcePort datasource;

    public Service210(Entity210DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model210 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
