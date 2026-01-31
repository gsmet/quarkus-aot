package fr.spacefox.perftests.quarkus.core.service990;

import fr.spacefox.perftests.quarkus.core.port.data.Entity990DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service990.model.Model990;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service990 {

    private final Entity990DatasourcePort datasource;

    public Service990(Entity990DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model990 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
