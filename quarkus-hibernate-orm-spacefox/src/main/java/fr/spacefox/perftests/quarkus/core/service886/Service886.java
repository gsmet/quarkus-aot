package fr.spacefox.perftests.quarkus.core.service886;

import fr.spacefox.perftests.quarkus.core.port.data.Entity886DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service886.model.Model886;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service886 {

    private final Entity886DatasourcePort datasource;

    public Service886(Entity886DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model886 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
