package fr.spacefox.perftests.quarkus.core.service967;

import fr.spacefox.perftests.quarkus.core.port.data.Entity967DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service967.model.Model967;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service967 {

    private final Entity967DatasourcePort datasource;

    public Service967(Entity967DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model967 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
