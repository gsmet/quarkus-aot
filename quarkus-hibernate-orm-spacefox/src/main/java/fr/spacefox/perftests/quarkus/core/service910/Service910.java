package fr.spacefox.perftests.quarkus.core.service910;

import fr.spacefox.perftests.quarkus.core.port.data.Entity910DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service910.model.Model910;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service910 {

    private final Entity910DatasourcePort datasource;

    public Service910(Entity910DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model910 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
