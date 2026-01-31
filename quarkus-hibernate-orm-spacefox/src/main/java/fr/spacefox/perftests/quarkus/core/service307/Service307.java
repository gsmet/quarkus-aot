package fr.spacefox.perftests.quarkus.core.service307;

import fr.spacefox.perftests.quarkus.core.port.data.Entity307DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service307.model.Model307;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service307 {

    private final Entity307DatasourcePort datasource;

    public Service307(Entity307DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model307 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
