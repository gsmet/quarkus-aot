package fr.spacefox.perftests.quarkus.core.service306;

import fr.spacefox.perftests.quarkus.core.port.data.Entity306DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service306.model.Model306;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service306 {

    private final Entity306DatasourcePort datasource;

    public Service306(Entity306DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model306 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
