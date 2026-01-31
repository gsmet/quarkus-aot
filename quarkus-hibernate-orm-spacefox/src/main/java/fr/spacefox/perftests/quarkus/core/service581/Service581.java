package fr.spacefox.perftests.quarkus.core.service581;

import fr.spacefox.perftests.quarkus.core.port.data.Entity581DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service581.model.Model581;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service581 {

    private final Entity581DatasourcePort datasource;

    public Service581(Entity581DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model581 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
