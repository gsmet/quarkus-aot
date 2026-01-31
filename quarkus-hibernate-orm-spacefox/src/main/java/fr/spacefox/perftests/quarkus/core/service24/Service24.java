package fr.spacefox.perftests.quarkus.core.service24;

import fr.spacefox.perftests.quarkus.core.port.data.Entity24DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service24.model.Model24;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service24 {

    private final Entity24DatasourcePort datasource;

    public Service24(Entity24DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model24 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
