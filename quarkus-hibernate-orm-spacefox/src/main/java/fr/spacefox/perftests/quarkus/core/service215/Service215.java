package fr.spacefox.perftests.quarkus.core.service215;

import fr.spacefox.perftests.quarkus.core.port.data.Entity215DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service215.model.Model215;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service215 {

    private final Entity215DatasourcePort datasource;

    public Service215(Entity215DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model215 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
