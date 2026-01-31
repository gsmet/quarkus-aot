package fr.spacefox.perftests.quarkus.core.service926;

import fr.spacefox.perftests.quarkus.core.port.data.Entity926DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service926.model.Model926;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service926 {

    private final Entity926DatasourcePort datasource;

    public Service926(Entity926DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model926 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
