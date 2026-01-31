package fr.spacefox.perftests.quarkus.core.service814;

import fr.spacefox.perftests.quarkus.core.port.data.Entity814DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service814.model.Model814;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service814 {

    private final Entity814DatasourcePort datasource;

    public Service814(Entity814DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model814 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
