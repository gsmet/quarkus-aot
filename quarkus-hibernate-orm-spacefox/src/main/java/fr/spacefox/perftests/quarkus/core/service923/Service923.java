package fr.spacefox.perftests.quarkus.core.service923;

import fr.spacefox.perftests.quarkus.core.port.data.Entity923DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service923.model.Model923;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service923 {

    private final Entity923DatasourcePort datasource;

    public Service923(Entity923DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model923 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
