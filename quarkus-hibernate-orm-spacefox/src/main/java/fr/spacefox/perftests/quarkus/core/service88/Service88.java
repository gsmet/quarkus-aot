package fr.spacefox.perftests.quarkus.core.service88;

import fr.spacefox.perftests.quarkus.core.port.data.Entity88DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service88.model.Model88;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service88 {

    private final Entity88DatasourcePort datasource;

    public Service88(Entity88DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model88 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
