package fr.spacefox.perftests.quarkus.core.service754;

import fr.spacefox.perftests.quarkus.core.port.data.Entity754DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service754.model.Model754;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service754 {

    private final Entity754DatasourcePort datasource;

    public Service754(Entity754DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model754 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
