package fr.spacefox.perftests.quarkus.core.service572;

import fr.spacefox.perftests.quarkus.core.port.data.Entity572DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service572.model.Model572;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service572 {

    private final Entity572DatasourcePort datasource;

    public Service572(Entity572DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model572 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
