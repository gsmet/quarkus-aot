package fr.spacefox.perftests.quarkus.core.service419;

import fr.spacefox.perftests.quarkus.core.port.data.Entity419DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service419.model.Model419;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service419 {

    private final Entity419DatasourcePort datasource;

    public Service419(Entity419DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model419 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
