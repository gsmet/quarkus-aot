package fr.spacefox.perftests.quarkus.core.service759;

import fr.spacefox.perftests.quarkus.core.port.data.Entity759DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service759.model.Model759;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service759 {

    private final Entity759DatasourcePort datasource;

    public Service759(Entity759DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model759 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
