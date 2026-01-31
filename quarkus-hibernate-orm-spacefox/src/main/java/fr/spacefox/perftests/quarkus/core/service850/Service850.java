package fr.spacefox.perftests.quarkus.core.service850;

import fr.spacefox.perftests.quarkus.core.port.data.Entity850DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service850.model.Model850;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service850 {

    private final Entity850DatasourcePort datasource;

    public Service850(Entity850DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model850 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
