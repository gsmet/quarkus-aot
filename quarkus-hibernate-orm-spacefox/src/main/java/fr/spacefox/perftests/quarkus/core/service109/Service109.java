package fr.spacefox.perftests.quarkus.core.service109;

import fr.spacefox.perftests.quarkus.core.port.data.Entity109DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service109.model.Model109;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service109 {

    private final Entity109DatasourcePort datasource;

    public Service109(Entity109DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model109 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
