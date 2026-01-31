package fr.spacefox.perftests.quarkus.core.service148;

import fr.spacefox.perftests.quarkus.core.port.data.Entity148DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service148.model.Model148;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service148 {

    private final Entity148DatasourcePort datasource;

    public Service148(Entity148DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model148 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
