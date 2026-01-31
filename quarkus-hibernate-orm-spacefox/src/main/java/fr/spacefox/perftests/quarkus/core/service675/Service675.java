package fr.spacefox.perftests.quarkus.core.service675;

import fr.spacefox.perftests.quarkus.core.port.data.Entity675DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service675.model.Model675;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service675 {

    private final Entity675DatasourcePort datasource;

    public Service675(Entity675DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model675 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
