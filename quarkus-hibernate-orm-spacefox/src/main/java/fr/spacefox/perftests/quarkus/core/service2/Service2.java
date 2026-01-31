package fr.spacefox.perftests.quarkus.core.service2;

import fr.spacefox.perftests.quarkus.core.port.data.Entity2DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service2.model.Model2;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service2 {

    private final Entity2DatasourcePort datasource;

    public Service2(Entity2DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model2 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
