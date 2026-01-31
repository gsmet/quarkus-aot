package fr.spacefox.perftests.quarkus.core.service209;

import fr.spacefox.perftests.quarkus.core.port.data.Entity209DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service209.model.Model209;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service209 {

    private final Entity209DatasourcePort datasource;

    public Service209(Entity209DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model209 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
