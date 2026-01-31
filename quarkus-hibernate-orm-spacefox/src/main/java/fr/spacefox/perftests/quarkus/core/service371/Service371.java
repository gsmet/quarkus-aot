package fr.spacefox.perftests.quarkus.core.service371;

import fr.spacefox.perftests.quarkus.core.port.data.Entity371DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service371.model.Model371;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service371 {

    private final Entity371DatasourcePort datasource;

    public Service371(Entity371DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model371 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
