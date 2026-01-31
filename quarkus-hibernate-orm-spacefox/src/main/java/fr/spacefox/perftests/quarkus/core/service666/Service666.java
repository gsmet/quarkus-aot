package fr.spacefox.perftests.quarkus.core.service666;

import fr.spacefox.perftests.quarkus.core.port.data.Entity666DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service666.model.Model666;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service666 {

    private final Entity666DatasourcePort datasource;

    public Service666(Entity666DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model666 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
