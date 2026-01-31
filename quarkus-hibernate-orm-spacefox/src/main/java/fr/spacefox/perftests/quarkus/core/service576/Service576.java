package fr.spacefox.perftests.quarkus.core.service576;

import fr.spacefox.perftests.quarkus.core.port.data.Entity576DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service576.model.Model576;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service576 {

    private final Entity576DatasourcePort datasource;

    public Service576(Entity576DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model576 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
