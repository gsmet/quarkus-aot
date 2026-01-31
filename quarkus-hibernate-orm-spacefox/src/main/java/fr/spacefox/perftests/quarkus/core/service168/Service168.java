package fr.spacefox.perftests.quarkus.core.service168;

import fr.spacefox.perftests.quarkus.core.port.data.Entity168DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service168.model.Model168;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service168 {

    private final Entity168DatasourcePort datasource;

    public Service168(Entity168DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model168 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
