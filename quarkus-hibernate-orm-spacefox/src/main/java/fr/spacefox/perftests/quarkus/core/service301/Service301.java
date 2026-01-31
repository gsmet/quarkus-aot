package fr.spacefox.perftests.quarkus.core.service301;

import fr.spacefox.perftests.quarkus.core.port.data.Entity301DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service301.model.Model301;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service301 {

    private final Entity301DatasourcePort datasource;

    public Service301(Entity301DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model301 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
