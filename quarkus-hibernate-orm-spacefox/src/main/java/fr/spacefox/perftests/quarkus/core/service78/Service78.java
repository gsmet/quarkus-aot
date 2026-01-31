package fr.spacefox.perftests.quarkus.core.service78;

import fr.spacefox.perftests.quarkus.core.port.data.Entity78DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service78.model.Model78;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service78 {

    private final Entity78DatasourcePort datasource;

    public Service78(Entity78DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model78 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
